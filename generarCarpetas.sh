#!/bin/bash
# Generar Carpetas de sesiones
contador=1
termina=11

until [ $termina -le $contador ]
do
	mkdir "$contador. Sesión"
	cd "$contador. Sesión"
	mkdir "2. Work"
	mkdir "3. Post-Work"
	cd ..
	echo $contador
	let contador=$contador+1
done
