def count_subString(string, sub_string, flag):
    
	count = 0
	i = 0
	len_subString = len(sub_string)
	
	while (i <= len(string) - len_subString):
		if (string[i:i + len_subString] == sub_string):
			count += 1
			if flag:
				i += 1
			else:
				i += len_subString
		else:
			i += 1
	return count 
	
string = input()
sub_string = input()

string = 'sgggs', 
sub_string = 'gg'

string = 'sgggggs'
sub_string = 'ggg'

print(count_subString(string, sub_string, True))
