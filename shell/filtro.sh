echo "Digite o caminho do arquivo: "
read path

[ -z $path ] && echo "Erro: Passe o caminho do arquivo" && exit 1 
[ ! -f $path ] && echo "Erro: Passe um caminho válido" && exit 1

echo "Criando Arquivo dados.csv"

curso01='ELEMENTARY'
curso02='HIGH_SCHOOL'
curso03='GED_ELEMENTARY'
curso04='GED_SECONDARY'
curso05='BACHELOR'
curso06='ADULT_LITERACY'
curso07='PRESCHOOL'
curso08='PREPARATORY'
curso09='POSTGRADUATE'

# separa do arquivo do IBGE apenas informações do rio (33)
# separa colunas sobre sexo, data nascimento e curso respectivamente
# primeiro caracter, transforma 1 em homem e 2 em mulher

egrep '^33' $path  | cut -c104,105-112,151-152 --output-delimiter=, | sed s/^1/MALE/ | sed s/^2/FEMALE/ | while read line 
do
	curso=$(echo $line| cut -d, -f3 | sed -E "s/([0-9]{2})$/\$curso\1/")
	newLine=$(echo $line | sed -E "s/[0-9]{2}$/$(eval echo $curso)/" | sed -E "s/,$/,NONE/")
	echo $newLine >> dados.csv

	# echo $newLine
done 


