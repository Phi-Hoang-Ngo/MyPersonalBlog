package com.marrerollc.MyPersonalBlog.BlogPost;

import org.springframework.data.repository.CrudRepository;
import java.math.BigInteger;

public interface BlogPostRepository extends CrudRepository<BlogPost, BigInteger>{
}

