SOURCES=$(shell find -type f -name "*.java")
CLASSES=$(SOURCES:.java=.class)
CLEANSER=rm -f 

clean : 
	$(CLEANSER) $(CLASSES)
