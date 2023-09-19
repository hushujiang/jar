package com.github.catvod.spider.merge.p060v;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.v.v */
/* loaded from: classes.dex */
final class C0739v extends AbstractC0718a {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<AbstractC0741x<?>, Set<Throwable>> f1370a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater<AbstractC0741x<?>> f1371b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0739v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((C0738u) null);
        this.f1370a = atomicReferenceFieldUpdater;
        this.f1371b = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: d */
    public final void mo37d(AbstractC0741x abstractC0741x, Set set) {
        AtomicReferenceFieldUpdater<AbstractC0741x<?>, Set<Throwable>> atomicReferenceFieldUpdater = this.f1370a;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0741x, null, set) && atomicReferenceFieldUpdater.get(abstractC0741x) == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: e */
    public final int mo36e(AbstractC0741x<?> abstractC0741x) {
        return this.f1371b.decrementAndGet(abstractC0741x);
    }
}
