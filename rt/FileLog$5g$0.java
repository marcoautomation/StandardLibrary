package base;
import java.nio.file.Path;
import java.util.IdentityHashMap;

import static base.Util.*;

public interface FileLog$5g$0 extends CaptureFree$2dk$0{
  default Object imm$name$0(){
    throw new AssertionError("Uncallable method: FileLog$5g$0.imm$name$0"+this.getClass().getName());
  }
  default Object imm$log$1(Object p0){
    _FileLogs.of(this).append(toS(p0));
    return Void$o$0.instance;
  }
}
class _FileLogs{
  private static final IdentityHashMap<Class<?>,AppLog> all= new IdentityHashMap<>();
  static synchronized AppLog of(Object log){
    return all.computeIfAbsent(log.getClass().getInterfaces()[0], _-> open(log));
  }
  private static AppLog open(Object log){
    var name= toS(((FileLog$5g$0)log).imm$name$0());
    return AppLog.open(Path.of(".out","logs",name,name+".log"), false);
  }
}
