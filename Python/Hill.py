
picos = int(input("Picos: ")); h = input("Ingrese las Alturas: ").split(" "); h = [int(i) for i in h]
hmax = 0;

for i in range (0,len(h)):
    if h[i]>hmax:
        hmax=h[i]

hmax = hmax - (h[0]+h[len(h)-1])

if hmax<0:
    hmax=0

print(hmax)

