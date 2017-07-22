package com.accessbankplc.harmony.graphql.classes

import com.accessbankplc.harmony.controllers.GraphQLController
import com.accessbankplc.harmony.graphql.types.Viewer
import com.coxautodev.graphql.tools.GraphQLRootResolver
import graphql.schema.DataFetchingEnvironment
import java.util.concurrent.CompletableFuture

/**
 * Created by peace on 5/27/17.
 */
class Query :GraphQLRootResolver{
    fun viewer(environment:DataFetchingEnvironment): Viewer {
        val context = environment.getContext<GraphQLController.Companion.GraphQLContext>()
        val requestIpAddress = context.ipAddress
        val requestPort = context.port

        return CompletableFuture.completedFuture(Viewer(ipAddress = requestIpAddress, port = requestPort, id = requestIpAddress)).get()
    }
    fun anotherField(env: DataFetchingEnvironment):String?{
        return null
    }


    fun hello(): String {
        return "Ore"
    }
}