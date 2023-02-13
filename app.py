import os
import argparse


player = "mplayer "
dir_path = "/home/saydum/Music/"

list_files = []

for path in os.listdir(dir_path):
    if os.path.isfile(os.path.join(dir_path, path)):
        list_files.append(path)

cmd = player + dir_path + list_files.pop(0)

os.system(cmd)


#
# """
# All
# app -l
# 1 jaz.mp3
# 2 hip-hop.mp3
#
# Play
# app -p 2
# app -p
#
# Delete
# app -d 1
#
# Hot keys ???
# >>>
# <<<
# ||
# >
# """
# parser = argparse.ArgumentParser()
# parser.add_argument("-l")
# parser.add_argument("-p")
# parser.add_argument("-d")
#
# args = parser.parse_args()


