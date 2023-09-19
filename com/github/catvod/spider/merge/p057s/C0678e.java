package com.github.catvod.spider.merge.p057s;

import com.github.catvod.spider.merge.p056r.C0665m;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.s.e */
/* loaded from: classes.dex */
public final class C0678e extends AbstractC0679f<Object> {

    /* renamed from: d */
    final transient int f1281d;

    /* renamed from: e */
    final transient int f1282e;

    /* renamed from: f */
    final /* synthetic */ AbstractC0679f f1283f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0678e(AbstractC0679f abstractC0679f, int i, int i2) {
        this.f1283f = abstractC0679f;
        this.f1281d = i;
        this.f1282e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: b */
    public final Object[] mo103b() {
        return this.f1283f.mo103b();
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: c */
    final int mo102c() {
        return this.f1283f.mo101d() + this.f1281d + this.f1282e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: d */
    public final int mo101d() {
        return this.f1283f.mo101d() + this.f1281d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0665m.m127e(i, this.f1282e);
        return this.f1283f.get(i + this.f1281d);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0679f, java.util.List
    /* renamed from: h */
    public final AbstractC0679f<Object> subList(int i, int i2) {
        C0665m.m125g(i, i2, this.f1282e);
        AbstractC0679f abstractC0679f = this.f1283f;
        int i3 = this.f1281d;
        return abstractC0679f.subList(i + i3, i2 + i3);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0679f, com.github.catvod.spider.merge.p057s.AbstractC0676c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0679f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0679f, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1282e;
    }
}
