package com.skilledsdet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleContainerDto {

    private String pictureLink;
    private String title;
    private String dateToPost;
    private String timeToRead;
}
