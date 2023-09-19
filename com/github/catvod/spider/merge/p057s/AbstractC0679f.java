package com.github.catvod.spider.merge.p057s;

import com.github.catvod.spider.merge.p056r.C0665m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.github.catvod.spider.merge.s.f */
/* loaded from: classes.dex */
public abstract class AbstractC0679f<E> extends AbstractC0676c<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final AbstractC0687n<Object> f1284b = new C0677d(C0683j.f1289f, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f1285c = 0;

    /* renamed from: f */
    public static <E> AbstractC0679f<E> m111f(E[] eArr) {
        if (eArr.length == 0) {
            return (AbstractC0679f<E>) C0683j.f1289f;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            C0682i.m104a(objArr[i], i);
        }
        int length2 = objArr.length;
        if (length2 == 0) {
            return (AbstractC0679f<E>) C0683j.f1289f;
        }
        return new C0683j(objArr, length2);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: a */
    int mo99a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[0 + i] = get(i);
        }
        return 0 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: e */
    public final AbstractC0686m<E> mo98e() {
        return listIterator(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != r6) goto L6
        L4:
            r0 = 1
            goto L5b
        L6:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L5b
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L4
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.github.catvod.spider.merge.p010K.C0052e.m1417b(r4, r5)
            if (r4 != 0) goto L2e
            goto L5b
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L5b
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.github.catvod.spider.merge.p010K.C0052e.m1417b(r3, r4)
            if (r3 != 0) goto L39
            goto L5b
        L55:
            boolean r7 = r7.hasNext()
            r0 = r7 ^ 1
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p057s.AbstractC0679f.equals(java.lang.Object):boolean");
    }

    @Override // java.util.List
    /* renamed from: g */
    public final AbstractC0687n<E> listIterator(int i) {
        C0665m.m126f(i, size());
        return isEmpty() ? (AbstractC0687n<E>) f1284b : new C0677d(this, i);
    }

    @Override // java.util.List
    /* renamed from: h */
    public AbstractC0679f<E> subList(int i, int i2) {
        C0665m.m125g(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (AbstractC0679f<E>) C0683j.f1289f;
        }
        return new C0678e(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ((get(i2).hashCode() + (i * 31)) ^ (-1)) ^ (-1);
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
