#
# Copyright (c) 2016 Obeo.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
# 	Obeo - initial API and implementation
#

EXEC_NAME=JSPilotingMinimal

SDK_DIR=ARDroneSDK_Unix

IDIR=./
CFLAGS=-I$(IDIR) -I$(SDK_DIR)/include

OBJDIR=obj
LDIR = $(SDK_DIR)/lib

EXTERNAL_LIB=-lncurses

LIBS=-L$(LDIR) -larsal -larcontroller-3.1.0 -lardiscovery-3.1.0 $(EXTERNAL_LIB) -Wl,-rpath=$(LDIR)
LIBS_DBG=-L$(LDIR) -larsal_dbg -larcontroller_dbg -lardiscovery_dbg $(EXTERNAL_LIB) -Wl,-rpath=$(LDIR)

_DEPS = JSPilotingMinimalCommands.h
DEPS = $(patsubst %,$(IDIR)/%,$(_DEPS))

_OBJ = JSPilotingMinimalCommands.o main.o
OBJ = $(patsubst %,$(OBJDIR)/%,$(_OBJ))

$(OBJDIR)/%.o: %.c $(DEPS)
	@ [ -d $(OBJDIR) ] || mkdir $(OBJDIR)
	@ $(CC) -c -o $@ $< $(CFLAGS)

$(EXEC_NAME): $(OBJ)
	$(CC) -o $@ $^ $(CFLAGS) $(LIBS)

.PHONY: clean

clean:
	@ rm -f $(OBJDIR)/*.o *~ core $(INCDIR)/*~
	@ rm -rf $(OBJDIR)
	@ rm -r $(EXEC_NAME)

run:
	LD_LIBRARY_PATH=$(LDIR) ./$(EXEC_NAME)
