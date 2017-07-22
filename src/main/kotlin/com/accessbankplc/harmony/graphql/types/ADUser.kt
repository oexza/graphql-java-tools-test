package com.accessbankplc.harmony.graphql.types

/**
 * Created by peace on 6/3/17.
 */

data class ADUser(val id:String?, val displayName: String?):Node{
    override fun id(): String? {
        return id
    }
}