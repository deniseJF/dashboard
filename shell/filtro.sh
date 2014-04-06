#eval echo \$curso$num
curso01='Regular do ensino fundamental ou do 1° grau'

egrep '^33' ../ibge/PMEnova.012014.txt | cut -c104,105-112,151-152 --output-delimiter=, | sed s/^1/HOMEM/ | sed s/^2/MULHER/
