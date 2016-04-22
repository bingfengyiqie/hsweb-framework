package org.hsweb.web.service.form;

import org.hsweb.web.bean.common.*;
import org.hsweb.web.bean.po.form.Form;

import java.util.List;
import java.util.Map;

/**
 * Created by zhouhao on 16-4-14.
 */
public interface DynamicFormService {

    void deploy(Form form) throws Exception;

    void unDeploy(Form form) throws Exception;

    <T> PagerResult<T> selectPager(String name, QueryParam param) throws Exception;

    <T> List<T> select(String name, QueryParam param) throws Exception;

    int total(String name, QueryParam param) throws Exception;

    int insert(String name, InsertParam<Map<String, Object>> data) throws Exception;

    int delete(String name,DeleteParam param) throws Exception;

    int update(String name, UpdateParam<Map<String, Object>> param) throws Exception;

    <T> T selectByPk(String name, Object pk) throws Exception;
}
