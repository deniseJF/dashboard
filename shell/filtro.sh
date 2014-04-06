
curso01='Regular do ensino fundamental ou do 1° grau'
curso02='Regular do ensino médio ou do 2º grau'
curso03='Supletivo do ensino fundamental ou do 1º grau'
curso04='Supletivo do ensino médio ou do 2º grau'
curso05='Superior - graduação'
curso06='Alfabetização de adultos'
curso07='Pré-escolar'
curso08='Pré-vestibular'
curso09='Mestrado ou doutorado'

# separa do arquivo do IBGE apenas informações do rio (33)
# separa colunas sobre sexo, data nascimento e curso respectivamente
# primeiro caracter, transforma 1 em homem e 2 em mulher

egrep '^33' ../ibge/PMEnova.012014.txt | cut -c104,105-112,151-152 --output-delimiter=, | sed s/^1/HOMEM/ | sed s/^2/MULHER/ | while read line 
do
	curso=$(echo $line| cut -d, -f3| sed -E "s/([0-9]{2})$/\$curso\1/")
	newLine=$(echo $line | sed -E "s/[0-9]{2}$/$(eval echo $curso)/")
	echo $newLine >> dados.csv
done 



#echo $filter
