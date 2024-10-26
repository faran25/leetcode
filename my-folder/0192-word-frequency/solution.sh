# Read from the file words.txt and output the word frequency list to stdout.
awk '\
{ for (i=1; i<=NF; i++) { ++D[$i]; } }\
END { for (i in D) { print i, D[i] } }\
' words.txt | sort -nr -k 2
