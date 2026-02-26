import re
from collections import Counter

with open('demo.log', 'r') as f:
    log_content = f.read()

cleaned_text = log_content.lower()
cleaned_text = re.sub(r'[^a-z0-9\s]', '', cleaned_text) 
words = cleaned_text.split()
word_counts = Counter(words)
total_words = sum(word_counts.values())
print(f"Updated word counts for {len(word_counts)} unique words.")
print(f"Total words: {total_words}")

threshold = total_words * 0.01

infrequent_words = [word for word, count in word_counts.items() if count < threshold]

print("\nWords appearing in less than 1% of the total extended log (flagged with #):")
if infrequent_words:
    for word in infrequent_words:
        print(f"#{word}")
else:
    print("No words found that appear in less than 1% of the total extended log.")