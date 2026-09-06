package base;
public interface CacheF$2p$1 extends base.CacheHandler$4sg$0{
  default Object imm$$hash$0(){
    throw new AssertionError("Uncallable method: CacheF$2p$1.imm$$hash$0"+this.getClass().getName());
  }
  default Cache0 _cache0(){ return CacheF$2p$1.myCache.computeIfAbsent(this,v->new Cache0(1,v)); }
  default Object imm$_get$0(){
    return _cache0().get();
  }
  java.util.concurrent.ConcurrentHashMap<CacheF$2p$1, Cache0> myCache= new java.util.concurrent.ConcurrentHashMap<>();
}