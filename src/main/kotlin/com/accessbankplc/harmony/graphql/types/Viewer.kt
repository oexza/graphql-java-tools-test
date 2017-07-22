package com.accessbankplc.harmony.graphql.types

import graphql.schema.DataFetchingEnvironment

/**
 * Created by peace on 5/29/17.
 */
data class Viewer(val id: String?, val ipAddress: String?, val port: Int?):Node{


    override fun id(): String? {
        return id
    }

}