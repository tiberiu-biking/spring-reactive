echo ">>Cleanup"
rm -rvf results jmeter.log results.log
echo ">>Create out folders"
mkdir -v results
echo ">>Run load test"
jmeter -n -t load-test.jmx -l results.log -e -o results
