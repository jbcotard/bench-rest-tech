#!/bin/sh

inject() {
	url=$1;
	for i in {1..100};
	do http $url;
	done;
}

APPLI_INJECT=$1
HOST_INJECT=$2
PORT_INJECT=$3

# injection des requetes GET + enregistrement des resultats
START=$(date +%s)
inject http://${HOST_INJECT}:${PORT_INJECT} >/dev/null
END=$(date +%s)

# consolidation des resultats
DIFF=$(echo "$END - $START" | bc)
echo $DIFF

workbenchfile=${APPLI_INJECT}_$(date +%s).out

echo "Injection sur ${APPLI_INJECT} (${HOST_INJECT}:${PORT_INJECT}) - $(date)" > $workbenchfile;
echo "-----------------------------------------------------------------------" >> $workbenchfile;
echo "$DIFF sec." >> $workbenchfile;


