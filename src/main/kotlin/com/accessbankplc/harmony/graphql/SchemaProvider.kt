package com.accessbankplc.harmony.graphql

import com.accessbankplc.harmony.graphql.classes.Query
import com.accessbankplc.harmony.graphql.classes.ViewerResolver
import com.accessbankplc.harmony.graphql.types.ADUser
import com.accessbankplc.harmony.graphql.types.Node
import com.accessbankplc.harmony.graphql.types.Viewer
import com.coxautodev.graphql.tools.SchemaParser
import graphql.schema.GraphQLSchema
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

/**
 * Created by peace on 5/27/17.
 */
@Component
class SchemaProvider{

    val schema: GraphQLSchema

    constructor(){
        schema = createSchema()
    }

    private fun createSchema() : GraphQLSchema {
        val parser = SchemaParser.newParser()
                .files("Schema.graphqls", "Internal.graphqls")
                .resolvers(Query(), ViewerResolver())
                .dictionary(Node::class.java)
                .build()
        return parser.makeExecutableSchema()
    }
}
