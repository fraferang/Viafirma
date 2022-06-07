<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

    <h2>Viafirma</h2>
    <div class="row">
        <div class="col-md-12">
		De esta forma recuperamos la variable path de un directorio:
		
		Path path = Paths.get("static/resources/path/VIAFIRMA_PATH.txt");
        </div>
    </div>
    <br><br>
    <a href="/"><button>Inicio</button></a>
