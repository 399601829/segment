package com.github.houbb.segment.support.tire;

import java.util.Map;

/**
 * 分词前缀树接口
 * @author binbin.hou
 * @since 0.0.1
 */
public interface ISegmentTireTree {

    /**
     * 获取对应的词信息
     *
     * ps: 即使列表为空，依然可以分词。
     * 没有 HMM 之前，就相当于与全部为单个字。
     *
     * @return 词信息列表
     * @since 0.0.1
     */
    Map getTireTree();

}
