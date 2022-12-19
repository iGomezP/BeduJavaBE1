#!/bin/bash
# Generar Carpetas de sesiones
contador=6
termina=8

until [ $termina -le $contador ]
do
	mkdir "Sesion-$contador"
	cd "Sesion-$contador"
	mkdir "2. Work"
	mkdir "3. Post-Work"
	cd ..
	echo $contador
	let contador=$contador+1
done
