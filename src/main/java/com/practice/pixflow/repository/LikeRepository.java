package com.practice.pixflow.repository;

import com.practice.pixflow.entity.LikeEntity;
import com.practice.pixflow.entity.PostEntity;
import com.practice.pixflow.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface LikeRepository extends CrudRepository<LikeEntity, Integer> {

    boolean existsByUserIdAndPostId(UserEntity user, PostEntity post);

    void deleteByUserIdAndPostId(UserEntity user, PostEntity post);

    Integer countByPostId(PostEntity post);

}
