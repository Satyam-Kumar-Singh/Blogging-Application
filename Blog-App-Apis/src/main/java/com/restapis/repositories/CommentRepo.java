package com.restapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapis.entities.Comment;


public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}