package com.github.catvod.spider.merge.p057s;

import com.github.catvod.spider.merge.p056r.C0665m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.s.j */
/* loaded from: classes.dex */
public final class C0683j<E> extends AbstractC0679f<E> {

    /* renamed from: f */
    static final AbstractC0679f<Object> f1289f = new C0683j(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f1290d;

    /* renamed from: e */
    private final transient int f1291e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0683j(Object[] objArr, int i) {
        this.f1290d = objArr;
        this.f1291e = i;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0679f, com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: a */
    final int mo99a(Object[] objArr) {
        System.arraycopy(this.f1290d, 0, objArr, 0, this.f1291e);
        return this.f1291e + 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: b */
    public final Object[] mo103b() {
        return this.f1290d;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: c */
    final int mo102c() {
        return this.f1291e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: d */
    public final int mo101d() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C0665m.m127e(i, this.f1291e);
        E e = (E) this.f1290d[i];
        e.getClass();
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1291e;
    }
}
