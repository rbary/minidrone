EXEC_NAME=RSPilotingMinimal #output filename

SDK_DIR=ARDroneSDK_Unix
IDIR=./
CFLAGS=-I$(IDIR) -I$(SDK_DIR)/include

OBJDIR=obj
LDIR = $(SDK_DIR)/lib

EXTERNAL_LIB=-lncurses

LIBS=-L$(SDK_DIR) -larcommands -larcontroller-3.1.0 -lardiscovery-3.1.0 -larnetworkal -larsal $(EXTERNAL_LIB)
LIBS_DBG=-L$(SDK_DIR) -larcommands_dbg -larcontroller_dbg -lardiscovery_dbg -larnetworkal_dbg -larsal_dbg $(EXTERNAL_LIB)

_DEPS = RollingSpiderPiloting.h ihm.h
DEPS = $(patsubst %,$(IDIR)/%,$(_DEPS))

_OBJ = RollingSpiderPiloting.o ihm.o
OBJ = $(patsubst %,$(OBJDIR)/%,$(_OBJ))

$(OBJDIR)/%.o: %.c $(DEPS)
	@ [ -d $(OBJDIR) ] || mkdir $(OBJDIR)
	@ $(CC) -c -o $@ $< $(CFLAGS)

$(EXEC_NAME): $(OBJ)
	gcc -o $@ $^ $(CFLAGS) $(LIBS)

.PHONY: clean

clean:
	@ rm -f $(OBJDIR)/*.o *~ core $(INCDIR)/*~
	@ rm -rf $(OBJDIR)
	@ rm -rf $(EXEC_NAME)

run:
	LD_LIBRARY_PATH=$(LDIR) ./$(EXEC_NAME)
