package com.example.demo.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.AgoraBody;
import com.example.demo.model.ResponseBody;

import io.agora.media.RtcTokenBuilder;

@Service
public class AgoraService {
   @Value("${app.id}")
	private String appId;
	 @Value("${app.certificate}")
	 private String appCertificate;

	public ResponseBody getRTCToken(AgoraBody resource) {

        RtcTokenBuilder token = new RtcTokenBuilder();
        String channelName = resource.getChannelName();
        int expireTime = resource.getExpirationTimeInSeconds();
        RtcTokenBuilder.Role role = RtcTokenBuilder.Role.Role_Publisher;
        int uid = resource.getUid();
        System.out.println(uid);
        // check for null channelName
        if (channelName==null){
        	 ResponseBody res = new ResponseBody();
             res.setToken("no token , please provide chaneel name");
             res.setStatus("failled");
             return res;
        }

        if(expireTime==0){
            expireTime = 3600;
        }

        if(resource.getRole()==1){
            role = RtcTokenBuilder.Role.Role_Publisher;
        } else if(resource.getRole()== 0) {
        	 role = RtcTokenBuilder.Role.Role_Subscriber;
        }
      
        int timestamp = (int)(System.currentTimeMillis() / 1000 + expireTime);


        String result = token.buildTokenWithUid(appId, appCertificate,
                channelName, uid, role, timestamp);
        System.out.print(result);
        ResponseBody res = new ResponseBody();
        res.setToken(result);
        res.setStatus("success");
        return res;
//        JSONObject jsondict = new JSONObject();
//        jsondict.put("message",result);
//        return jsondict;


    }
}
