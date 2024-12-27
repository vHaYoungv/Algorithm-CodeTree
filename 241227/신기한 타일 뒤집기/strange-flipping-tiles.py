n = int(input());
comm = [];
for i in range(4):
    m, d = input().split(); 
    comm.append((m,d));

now = 0;
l = 0;
r = 0;
for m,d in comm:
    m = int(m);
    if(d == "R"):
        now += m;
        if(now>=r): r=now;
    if(d == "L"):
        now -= m;
        if(now<=l): l=now;
print(r-now, now-l);
