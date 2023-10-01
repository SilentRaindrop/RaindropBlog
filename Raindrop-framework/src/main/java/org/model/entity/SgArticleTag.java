package org.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 文章标签关联表(SgArticleTag)表实体类
 *
 * @author makejava
 * @since 2023-10-01 23:32:11
 */
@SuppressWarnings("serial")
public class SgArticleTag extends Model<SgArticleTag> {
    //文章id
    private Long articleId;
    //标签id
    private Long tagId;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    }

