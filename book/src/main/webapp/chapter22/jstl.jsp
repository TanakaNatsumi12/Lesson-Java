<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="jakarta.tags.core" %>

<c:forEach var="p" items="${list}">
	${p.id}:${p.name}:${p.price}<br>
</c:forEach>

<c:set var="sum" value="0"/>
	

<p>合計：${sum}</p>

<%@include file="../footer.html" %>