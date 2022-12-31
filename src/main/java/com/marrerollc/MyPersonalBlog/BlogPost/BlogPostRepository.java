package com.marrerollc.MyPersonalBlog.BlogPost;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, BigInteger> {
}
