package com.accessbankplc.harmony.graphql.classes

import com.accessbankplc.harmony.graphql.types.ADLoginInput
import com.accessbankplc.harmony.graphql.types.ADUser
import com.accessbankplc.harmony.graphql.types.Viewer
import com.coxautodev.graphql.tools.GraphQLResolver
import graphql.schema.DataFetchingEnvironment
import graphql.schema.DataFetchingEnvironmentImpl
import java.util.concurrent.CompletableFuture

/**
 * Created by akinwaleoy on 6/2/2017.
 */
class ViewerResolver: GraphQLResolver<Viewer>{

    fun adLogin(viewer: Viewer, adLoginInput: ADLoginInput): CompletableFuture<ADUser> {
        return CompletableFuture.completedFuture(ADUser(id = "orepeace", displayName = "akinwaleoy"))
    }
}