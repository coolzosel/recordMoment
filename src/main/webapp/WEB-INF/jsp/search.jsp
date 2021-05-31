<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest-Board</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
    <!-- 네비 바 -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/board">devTest</a>
            <div class="collapse navbar-collapse" id="navbarColor03">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">${sessionScope.id}님 반갑습니다^0^*</li>
                    <li class="nav-item"><a href="/logout">로그아웃</a></li>
                </ul>
            </div>
        </div>
    </nav>
    
    <div class="container mt-5">
    	<h2><a href="/board">게시판</a></h2>
	    <table class="table table-hover">
		    <thead>
			    <tr>
			        <th scope="col" class="no">번호</th>
			        <th scope="col" class="title">제목</th>
			        <th scope="col" class="writer">작성자</th>
			        <th scope="col" class="time">작성시간</th>
			    </tr>
		    </thead>
		    <c:forEach items="${boardList.content}" var="item">
		        <tbody>
		        <tr>
		            <th scope="row">${item.no}</th>
		            <td><a href="/board/${item.no}">${item.title}</a></td>
		            <td>${item.id.id}</td>
		            <td>${item.date}</td>
		        </tr>
		        </tbody>
		    </c:forEach>
		</table>

		<div>
            <ul class="pagination pagination-sm">
                <c:choose>
                    <c:when test="${boardList.first}"></c:when>
                    <c:otherwise>
                        <li class="page-item"><a class="page-link" href="/board/?keyword=${param.keyword}&page=0">&laquo;</a></li>
                        <li class="page-item"><a class="page-link" href="/board/?keyword=${param.keyword}&page=${boardList.number-1}">&larr;</a></li>
                    </c:otherwise>
                </c:choose>

                <c:forEach begin="${startbp}" end="${endbp}" var="item">
                    <c:choose>
                        <c:when test="${boardList.pageable.pageNumber+1 == item}">
                            <li class="page-item active"><a class="page-link" href="/board/?keyword=${param.keyword}&page=${item-1}">${item}</a></li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item"><a class="page-link" href="/board/?keyword=${param.keyword}&page=${item-1}">${item}</a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                               
                <c:choose>
                    <c:when test="${boardList.last}"></c:when>
                    <c:otherwise>
                        <li class="page-item"><a class="page-link" href="/board/?keyword=${param.keyword}&page+1">&rarr;</a></li>
                        <li class="page-item"><a class="page-link" href="/board/?page=${boardList.totalPages-1}">&raquo;</a></li>
                    </c:otherwise>
                </c:choose>
              </ul>
        </div>

		<button type="button" onclick="location.href='/board'" class="btn btn-nm">전체목록</button>
		
		<form action="/search" method="GET">
	  	  <div class="btn-group" role="group">
	   		<input name="keyword" type="text" placeholder="검색어를 입력해주세요" class=>
	  	    <button class="btn">검색</button>
	 	  </div>
		</form>
		
    </div>
    
</body>
</html>