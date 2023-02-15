/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restAPI.Service;

import com.example.restAPI.Entity.Detail;
import com.example.restAPI.Entity.Header;
import com.example.restAPI.Repository.DetailRepository;
import com.example.restAPI.Repository.HeaderRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vckev
 */
@Service
public class HeaderDetailService {

    @Autowired
    private HeaderRepository headerRepo;
    @Autowired
    private DetailRepository detailRepo;

    public Object getData() {
        List<Header> headers = headerRepo.findAll();
        List<Detail> details = detailRepo.findAll();
        Map<String, Object> result = new LinkedHashMap<>();
        Map<String, Object> mapResult = new LinkedHashMap<>();
        List< Map<String, Object>> listServices = new ArrayList< Map<String, Object>>();
        List< Map<String, Object>> listServiceJson = new ArrayList< Map<String, Object>>();

        //services
        for (Header header : headers) {
            Long id = header.getId();
            String serviceName = header.getServiceName();

            Map<String, Object> map = new LinkedHashMap<>();
            map.put("id", id);
            map.put("service_name", serviceName);
            listServices.add(map);
        }

        //services_json
        System.out.println("SIZE LIST SERVICE: "+listServices.size());
        for (Map<String, Object> o : listServices) {
            Map<String, Object> mapElementJson = new LinkedHashMap<>();
            Map<String, Object> mapServiceId = new LinkedHashMap<>();
            Long id = (Long) o.get("id");
            String serviceName = (String) o.get("service_name");

            mapServiceId.put("id", id);
            mapServiceId.put("service_name", serviceName);

            List< Map<String, Object>> listJsonDetail = new ArrayList< Map<String, Object>>();

            for (Detail detail : details) {
//                Map<String, Object> mapServiceJson = new HashMap<>();
                if (detail.getServiceId() == id) {
                    Map<String, Object> mapJsonDetail = new LinkedHashMap<>();
                    Long detailId = detail.getId();
                    String group = detail.getGroup();
                    String parentDescription = null;
                    String description = detail.getDescription();
                    Integer mandatory = detail.getMandatory();
                    Integer sequence = detail.getSequence();
                    String parent = detail.getParent();
                    String type = detail.getType();
                    Integer isMultiple = detail.getIsMultiplied();
                    String remark = detail.getRemark();
                    String value = null;
                    mapJsonDetail.put("id", detailId);
                    mapJsonDetail.put("group", group);
                    mapJsonDetail.put("parent_description", parentDescription);
                    mapJsonDetail.put("description", description);
                    mapJsonDetail.put("mandatory", mandatory);
                    mapJsonDetail.put("sequence", sequence);
                    mapJsonDetail.put("parent", parent);
                    mapJsonDetail.put("type", type);
                    mapJsonDetail.put("is_multiple", isMultiple);
                    mapJsonDetail.put("remark", remark);
                    mapJsonDetail.put("value", value);
                    listJsonDetail.add(mapJsonDetail);
                }
            }
            
            mapElementJson.put("service_id", mapServiceId);
            mapElementJson.put("json", listJsonDetail);
            listServiceJson.add(mapElementJson);

        }
        mapResult.put("services", listServices);
        mapResult.put("services_json", listServiceJson);
        
        result.put("code", 200);
        result.put("status", "Success");
        result.put("data", mapResult);
        return result;
    }
    
}
