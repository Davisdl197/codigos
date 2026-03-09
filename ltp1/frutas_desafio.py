import random
 
frutas = {
    'banana':['é originária do sudeste Asiático','é rica em potássio','é amarela' ],
    'maçã':['é rica em vitamina c','pode ser vermelha ou verde','é símbolo de uma marca muito famosa'],
    'umbu':['é originária do nordeste do brasil','é verde','começa com a letra u'],
    'mamão':['é originária da américa central','é rica em vitamina c','é laranja por dentro'],
    'jabuticaba':['pode ser roxa ou preta','o nome se assemelha a um animal','começa com a letra j'],
    'abacaxi':['tem pontas','sua casca é dura','um personagem mora dentro dessa fruta'],
    'kiwi':['tem pelos','e marrom por fora e verde por dentro','lembra a textura de uma bola de tênis'],
 }

fruta_sorteada = random.choice(list(frutas.keys()))
dica = frutas[fruta_sorteada]
resposta = 0

print('Tente adivinhar a fruta\n')

tentativas = 0

while tentativas < 3:
    
    escolha = 0 

    print('Dica: ', dica[tentativas], '\n')
    print('\nSe quiser adivinhar, digite (a) ou se quiser mais uma dica digite (d).\n')
    
    escolha = input('Digite sua escolha: ')

    if escolha == 'd':

        tentativas += 1

    elif escolha == 'a':
       
        resposta = input('\nDigite a fruta: ')

        if resposta == fruta_sorteada:

            print('\nVocê acertou!')
            break

        else:

            print('\nVocê errou :(. Tente novamente.')

    if tentativas == 2:

        print('\nEssa é sua ultima tentativa e você so pode adivinhar.\n')
        print(dica[tentativas])

        resposta = input('\nDigite a fruta: ')

        if resposta == fruta_sorteada:

            print('\nVocê acertou!')
            break

        else:

            print('\nVocê errou!')
            print('\nA fruta era: ', fruta_sorteada)
            break



