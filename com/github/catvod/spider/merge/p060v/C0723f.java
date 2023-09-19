package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.v.f */
/* loaded from: classes.dex */
final class C0723f extends AbstractC0718a {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<C0731n, Thread> f1337a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater<C0731n, C0731n> f1338b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater<AbstractC0732o, C0731n> f1339c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater<AbstractC0732o, C0722e> f1340d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater<AbstractC0732o, Object> f1341e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0723f(AtomicReferenceFieldUpdater<C0731n, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0731n, C0731n> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0732o, C0731n> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0732o, C0722e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0732o, Object> atomicReferenceFieldUpdater5) {
        super((C0717W) null);
        this.f1337a = atomicReferenceFieldUpdater;
        this.f1338b = atomicReferenceFieldUpdater2;
        this.f1339c = atomicReferenceFieldUpdater3;
        this.f1340d = atomicReferenceFieldUpdater4;
        this.f1341e = atomicReferenceFieldUpdater5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: a */
    public final boolean mo69a(AbstractC0732o<?> abstractC0732o, C0722e c0722e, C0722e c0722e2) {
        AtomicReferenceFieldUpdater<AbstractC0732o, C0722e> atomicReferenceFieldUpdater = this.f1340d;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0732o, c0722e, c0722e2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0732o) != c0722e) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: b */
    public final boolean mo68b(AbstractC0732o<?> abstractC0732o, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater<AbstractC0732o, Object> atomicReferenceFieldUpdater = this.f1341e;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0732o, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0732o) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: c */
    public final boolean mo67c(AbstractC0732o<?> abstractC0732o, C0731n c0731n, C0731n c0731n2) {
        AtomicReferenceFieldUpdater<AbstractC0732o, C0731n> atomicReferenceFieldUpdater = this.f1339c;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0732o, c0731n, c0731n2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0732o) != c0731n) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: f */
    public final C0722e mo66f(AbstractC0732o abstractC0732o) {
        return this.f1340d.getAndSet(abstractC0732o, C0722e.f1333d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: g */
    public final C0731n mo65g(AbstractC0732o abstractC0732o) {
        return this.f1339c.getAndSet(abstractC0732o, C0731n.f1348c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: h */
    public final void mo64h(C0731n c0731n, C0731n c0731n2) {
        this.f1338b.lazySet(c0731n, c0731n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: i */
    public final void mo63i(C0731n c0731n, Thread thread) {
        this.f1337a.lazySet(c0731n, thread);
    }
}
