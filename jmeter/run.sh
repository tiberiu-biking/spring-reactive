rm -rvf out
mkdir out
rm -rfv jmeter.log results.log results.csv
jmeter -n -t reactive.jmx -l results.log -e -o out