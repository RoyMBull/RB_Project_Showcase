

function df_human_readable
{
	df -h -la 
}

function Clone
{ filesys="Disk_to_clone"
  CloneTo="/dev/sda"
	echo "Displaying File systems >>>>"
	clear
		df_human_readable
	echo "   "
	echo "   "
	echo "Enter the filesystem as you see it described"
		read filesys 
		dd if=$filesys of=$CloneTo bs=512
}


echo "Warning... All data on destination device will be DESTROYED"
sleep 4
	Clone
