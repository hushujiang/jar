package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.github.catvod.spider.merge.v.p */
/* loaded from: classes.dex */
public abstract class AbstractC0733p extends AbstractExecutorService implements InterfaceExecutorServiceC0709N {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new RunnableFutureC0716V(Executors.callable(runnable, t));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.github.catvod.spider.merge.p060v.InterfaceExecutorServiceC0709N
    public final <T> InterfaceFutureC0708M<T> submit(Callable<T> callable) {
        return (InterfaceFutureC0708M) super.submit((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (InterfaceFutureC0708M) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC0716V(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC0708M) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (InterfaceFutureC0708M) super.submit(callable);
    }
}
