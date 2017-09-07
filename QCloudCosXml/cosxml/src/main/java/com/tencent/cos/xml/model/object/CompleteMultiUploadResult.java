package com.tencent.cos.xml.model.object;


import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CompleteMultipartResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by bradyxiao on 2017/5/23.
 * author bradyxiao
 */
public class CompleteMultiUploadResult extends CosXmlResult {
    /**
     *  <a herf https://www.qcloud.com/document/product/436/7742></a>
     */
    @XStreamAlias("CompleteMultipartUploadResult")
    public CompleteMultipartResult completeMultipartUpload;
    @Override
    public String printBody() {
        return completeMultipartUpload != null ? completeMultipartUpload.toString() : super.printBody();
    }
}