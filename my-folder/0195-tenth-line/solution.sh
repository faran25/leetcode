# Read from the file file.txt and output the tenth line to stdout.
#1 awk 'NR==10' file.txt
#2 sed -n '10p' file.txt
#4 sed '10q;d' file.txt

n=1;
while read line ;
do
    if [  $n -eq 10  ]; then
        echo "$line"
    fi
    n=$((n+1));
done < file.txt
