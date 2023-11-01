#!/usr/bin/env python

import os
import json
import sys

def replace_strings_in_file(file_path, replacements):
    with open(file_path, 'r', encoding = 'utf-8') as file:
        content = file.read()
    for key, value in replacements.items():
        content = content.replace(key, value)
    with open(file_path, 'w', encoding = 'utf-8') as file:
        file.write(content)

def replace_strings_in_directory(directory, replacements, extensions):
    for root, dirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(root, file)
            if file_path.endswith(extensions):
                replace_strings_in_file(file_path, replacements)

def main():
    with open('initializer.json', 'r', encoding = 'utf-8') as json_file:
        replacements = json.load(json_file)
    extensions = ('.kt', '.properties', '.xml', '.gradle.kts', '.xcconfig', '.plist')
    replace_strings_in_directory('.', replacements, extensions)
    print("Project initialization successful.")
    os.remove(sys.argv[0])
    os.remove('initializer.json')

if __name__ == '__main__':
    main()