package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.github.catvod.spider.merge.v.N */
/* loaded from: classes.dex */
public interface InterfaceExecutorServiceC0709N extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> InterfaceFutureC0708M<T> submit(Callable<T> callable);
}
