package com.example.mkart.db.repositories

import com.example.mkart.db.models.Article
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface ArticleRepo: MongoRepository<Article, String> {
    override fun findById(@Param("id")id: String): Optional<Article>
    fun all(): List<Article>
}