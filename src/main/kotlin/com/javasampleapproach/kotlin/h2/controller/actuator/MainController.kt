package com.javasampleapproach.kotlin.h2.controller.actuator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest


@Controller
class MainController {
    @ResponseBody
    @RequestMapping(path = ["/"])
    fun home(request: HttpServletRequest): String {
        val contextPath = request.contextPath
        val host = request.serverName

        val endpointBasePath = "/actuator"
        val sb = StringBuilder()
        sb.append("<h2>Sprig Boot Actuator</h2>")
        sb.append("<ul>")

        // http://localhost:8090/actuator
        val url = "http://$host:8090$contextPath$endpointBasePath"
        sb.append("<li><a href='$url'>$url</a></li>")
        sb.append("</ul>")
        return sb.toString()
    }
}
