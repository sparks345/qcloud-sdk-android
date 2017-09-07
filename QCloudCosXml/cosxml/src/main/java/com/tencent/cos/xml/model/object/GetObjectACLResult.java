package com.tencent.cos.xml.model.object;


import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.AccessControlPolicy;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by bradyxiao on 2017/5/8.
 * author bradyxiao
 */
public class GetObjectACLResult extends CosXmlResult {
    /**
     * <a herf https://www.qcloud.com/document/product/436/7744></a>
     */
    @XStreamAlias("AccessControlPolicy")
    public AccessControlPolicy accessControlPolicy;
    @Override
    public String printBody() {
        return accessControlPolicy != null ? accessControlPolicy.toString() : super.printBody();
    }
}