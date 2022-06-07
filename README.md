¿Cómo harías para poder ejecutar N veces el proceso sobre el mismo directorio y solo modificar cada pdf una sola vez?

	Crearía una lista e iría añadiendo cada elemento que se haya modificado, al ejecutar el proceso N veces comprobaría si el pdf está en la lista, si lo está no se modifica y si no lo está se modifica y se añadiría a la lista.  

¿Qué pasa si el directorio contiene un fichero que no es un pdf? 

	Habría varias posibilidades dependiendo de cual sea el objetivo: 

		Si no se desea modificar un archivo que no sea pdf simplemente saltamos al siguiente.

		Si se desea transformar a formato pdf y la extensión del archivo lo permite, se procederá a la transformación de dicho archivo.

		Si se desea transformar a pdf y la extensión del archivo no lo permite, notificar el supuesto error y preguntar qué hacer con dicho archivo.
 
¿Cómo probar / ejecutar la aplicación?

	La aplicación se ejecuta ejecutanto la clase "PetclinicApplication"

¿Cómo podemos ver los logs?

	En el arranque de la aplicación -->  $ java -jar my-application.jar --debug     o en el fichero application.properties poniendo "debug=true"
