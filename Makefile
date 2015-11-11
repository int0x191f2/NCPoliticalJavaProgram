SOURCES=$(shell find -type f -name "*.java")
CLASSES=$(SOURCES:.java=.class)
CLEANSER=rm -f 
COMPILER=javac

all :
	$(COMPILER) $(SOURCES)

clean : 
	$(CLEANSER) $(CLASSES)
